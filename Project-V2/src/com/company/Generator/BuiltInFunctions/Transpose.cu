#include <stdio.h>
#include <assert.h>
#define N 10

__global__ void transpose(int transpose[][N], int matrix[][N], int matrixSize){
    int x = blockIdx.x * blockDim.x + threadIdx.x; 
    int y = blockIdx.y * blockDim.y + threadIdx.y; 

    if(x >= matrixSize || y>= matrixSize)
        return;

    transpose[y][x] = matrix[x][y];
}   

int main(){
    int A[N][N] = {{1,1,1,1,1,1,1,1,1,1,},{2,2,2,2,2,2,2,2,2,2},{3,3,3,3,3,3,3,3,3,3},{1,1,1,1,1,1,1,1,1,1,},{2,2,2,2,2,2,2,2,2,2},{3,3,3,3,3,3,3,3,3,3},{1,1,1,1,1,1,1,1,1,1,},{2,2,2,2,2,2,2,2,2,2},{3,3,3,3,3,3,3,3,3,3},{1,1,1,1,1,1,1,1,1,1}};
    int T[N][N] = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};    

    int (*pA)[N], (*pT)[N];

    cudaMalloc((void**)&pA, (N*N)*sizeof(int));
    cudaMalloc((void**)&pT, (N*N)*sizeof(int));

    cudaMemcpy(pA, A, (N*N)*sizeof(int), cudaMemcpyHostToDevice);
    cudaMemcpy(pT, T, (N*N)*sizeof(int), cudaMemcpyHostToDevice);

    unsigned int grid_rows = (N + BLOCK_SIZE - 1) / BLOCK_SIZE;
    unsigned int grid_cols = (N + BLOCK_SIZE - 1) / BLOCK_SIZE;
    dim3 dimGrid(grid_cols, grid_rows);
    dim3 dimBlock(BLOCK_SIZE, BLOCK_SIZE);
    transpose_per_element<<<dimGrid,dimBlock>>>(pT,pA,N*N);

    cudaMemcpy(T, pT, (N*N)*sizeof(int), cudaMemcpyDeviceToHost);

    int i, j; printf("A = \n");
    for(i=0;i<N;i++){
        for(j=0;j<N;j++){
            printf("%d ", A[i][j]);
        }
        printf("\n");
    }

    printf("T = \n");
    for(i=0;i<N;i++){
        for(j=0;j<N;j++){
            printf("%d ", T[i][j]);
        }
        printf("\n");
    }

    cudaFree(pA); 
    cudaFree(pT);

    printf("\n");

    return 0;
}