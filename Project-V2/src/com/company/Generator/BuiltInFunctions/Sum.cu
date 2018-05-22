#include <stdio.h>
#include <assert.h>
#define N 50

__global__ void MatrixSum(int matrix[][N], int Sum[][N]){
    __shared__ int LocalSum[N];
    int x = blockIdx.x * blockDim.x + threadIdx.x; 

    for(int i = 0; i < N; i++){
        LocalSum[x] += matrix[x][i];
    }
    __syncthreads();
    Sum[0][x] = LocalSum[x];
}

int main(){
    int A[N][N];
    int Sum[N];
    int finalSum = 0;
    int (*pA)[N], (*pS)[N];

    for(int i = 0; i < N; i++){
        for(int j = 0; j < N; j++)
        {
            A[i][j] = rand() % 2;
        }
    }

    cudaMalloc((void**)&pA, (N*N)*sizeof(int));
    cudaMalloc((void**)&pS, N*sizeof(int));

    cudaMemcpy(pA, A, (N*N)*sizeof(int), cudaMemcpyHostToDevice);

    unsigned int grid_rows = (N + BLOCK_SIZE - 1) / BLOCK_SIZE;
    unsigned int grid_cols = (N + BLOCK_SIZE - 1) / BLOCK_SIZE;
    dim3 dimGrid(grid_cols, grid_rows);
    dim3 dimBlock(BLOCK_SIZE, BLOCK_SIZE);
    MatrixSum<<<dimGrid,dimBlock>>>(pA,pS);

    cudaMemcpy(&Sum, pS, N*sizeof(int), cudaMemcpyDeviceToHost);

    for(int i = 0; i < N; i++){
        finalSum += Sum[i];
    }
    
    printf("A = \n");
    for(int i = 0; i < N; i++){
        int placeholder = 0;
        for(int j = 0; j < N; j++)
        {
            placeholder += A[i][j];
            printf("%d ", A[i][j]);
        }
        printf("P:%d \n", placeholder);
    }

    printf("Final Sum = %d\n", finalSum);

    cudaFree(pA); 
    cudaFree(pS);

    return 0;
}