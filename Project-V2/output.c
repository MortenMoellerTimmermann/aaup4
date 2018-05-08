float *host_A;
float *device_A;
cudaMallocHost((void**) &host_A, sizeof(float)*2*2);
cudaMalloc((void**) &device_A, sizeof(float)*2*2);
float A_values[4] = [1.0, 2.0, 3.0, 4.0];
for (int i = 0; i < 2; ++i) {
for (int j = 0; j < 2; ++j) {
A[i * 2 + j] = A_values[i * 2 + j];
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
B[i * 4 + j] = B_values[i * 4 + j];
}
}
cudaMemcpy(device_B, host_B, sizeof(float)*4*1, cudaMemcpyHostToDevice);
