#include <stdio.h>
#include <assert.h>
#define N 10

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
            A[i][j] = rand() % 5;
        }
    }

    cudaMalloc((void**)&pA, (N*N)*sizeof(int));
    cudaMalloc((void**)&pS, N*sizeof(int));

    cudaMemcpy(pA, A, (N*N)*sizeof(int), cudaMemcpyHostToDevice);

    int numBlocks = 1;
    dim3 threadsPerBlock(N,N);
    MatrixSum<<<numBlocks,N>>>(pA,pS);

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