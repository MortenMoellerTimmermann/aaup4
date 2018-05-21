#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
#define BLOCK_SIZE 16
__global__ void mscope_A(float *device_A, float *device_B) { float *host_G;
float *device_G;
cudaMallocHost((void**) &host_G, sizeof(float)*2*2);
cudaMalloc((void**) &device_G, sizeof(float)*2*2);
MatrixAdd(device_this, device_this, device_G)float *host_F;
float *device_F;
cudaMallocHost((void**) &host_F, sizeof(float)*4*1);
cudaMalloc((void**) &device_F, sizeof(float)*4*1);
float F_values[4] = [1.0, 2.0, 3.0, 4.0];
for (int i = 0; i < 1; ++i) {
for (int j = 0; j < 1; ++j) {
host_F[i * 4 + j] = F_values[i * 4 + j];
}
}
cudaMemcpy(device_F, host_F, sizeof(float)*4*1, cudaMemcpyHostToDevice);
G *=thisif(>0.0) {this =}A =A + A}__global__ void mscope_B(float *device_A, float *device_B) { }int main (int argc, char const *argv[]) {
float *host_A;
float *device_A;
cudaMallocHost((void**) &host_A, sizeof(float)*2*2);
cudaMalloc((void**) &device_A, sizeof(float)*2*2);
float A_values[4] = [1.0, 2.0, 3.0, 4.0];
for (int i = 0; i < 2; ++i) {
for (int j = 0; j < 2; ++j) {
host_A[i * 2 + j] = A_values[i * 2 + j];
}
}
cudaMemcpy(device_A, host_A, sizeof(float)*2*2, cudaMemcpyHostToDevice);
float *host_B;
float *device_B;
cudaMallocHost((void**) &host_B, sizeof(float)*4*2);
cudaMalloc((void**) &device_B, sizeof(float)*4*2);
float B_values[8] = [1.0, 2.0, 3.0, 4.0, 1.0, 2.0, 3.0, 4.0];
for (int i = 0; i < 2; ++i) {
for (int j = 0; j < 2; ++j) {
host_B[i * 4 + j] = B_values[i * 4 + j];
}
}
cudaMemcpy(device_B, host_B, sizeof(float)*4*2, cudaMemcpyHostToDevice);
mscope_A<<<dimGrid, dimBlock>>>(device_A, device_B);
mscope_B<<<dimGrid, dimBlock>>>(device_A, device_B);
cudeFree(device_A);
cudaFreeHost(host_A);
cudeFree(device_B);
cudaFreeHost(host_B);
return 0;
}
