#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
__global__ void mscope_A(float *device_A, float *device_B, float *device_C, float *device_D) { 

}

__global__ void mscope_C(float *device_A, float *device_B, float *device_C, float *device_D) { 

}

__global__ void mscope_D(float *device_A, float *device_B, float *device_C, float *device_D) { 
if(==) {}
}

__global__ void mscope_B(float *device_A, float *device_B, float *device_C, float *device_D) { 

}

int main (int argc, char const *argv[]) {
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
cudaMallocHost((void**) &host_B, sizeof(float)*4*1);
cudaMalloc((void**) &device_B, sizeof(float)*4*1);
float B_values[4] = [1.0, 2.0, 3.0, 4.0];
for (int i = 0; i < 1; ++i) {
for (int j = 0; j < 1; ++j) {
host_B[i * 4 + j] = B_values[i * 4 + j];
}
}
cudaMemcpy(device_B, host_B, sizeof(float)*4*1, cudaMemcpyHostToDevice);
float *host_C;
float *device_C;
cudaMallocHost((void**) &host_C, sizeof(float)*4*1);
cudaMalloc((void**) &device_C, sizeof(float)*4*1);
float C_values[4] = [1.0, 2.0, 3.0, 4.0];
for (int i = 0; i < 1; ++i) {
for (int j = 0; j < 1; ++j) {
host_C[i * 4 + j] = C_values[i * 4 + j];
}
}
cudaMemcpy(device_C, host_C, sizeof(float)*4*1, cudaMemcpyHostToDevice);
float *host_D;
float *device_D;
cudaMallocHost((void**) &host_D, sizeof(float)*4*1);
cudaMalloc((void**) &device_D, sizeof(float)*4*1);
float D_values[4] = [1.0, 2.0, 3.0, 4.0];
for (int i = 0; i < 1; ++i) {
for (int j = 0; j < 1; ++j) {
host_D[i * 4 + j] = D_values[i * 4 + j];
}
}
cudaMemcpy(device_D, host_D, sizeof(float)*4*1, cudaMemcpyHostToDevice);
mscope_A<<<dimGrid, dimBlock>>>(device_A, device_B, device_C, device_D);
mscope_C<<<dimGrid, dimBlock>>>(device_A, device_B, device_C, device_D);
mscope_D<<<dimGrid, dimBlock>>>(device_A, device_B, device_C, device_D);
mscope_B<<<dimGrid, dimBlock>>>(device_A, device_B, device_C, device_D);
cudeFree(device_A);
cudaFreeHost(host_A);
cudeFree(device_B);
cudaFreeHost(host_B);
cudeFree(device_C);
cudaFreeHost(host_C);
cudeFree(device_D);
cudaFreeHost(host_D);
return 0;
}
