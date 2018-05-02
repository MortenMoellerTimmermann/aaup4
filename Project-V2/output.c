#include <stdlib.h>;
#include <stdio.h>;
int main (void) {
	float *matrix_A;
	matrix_A = malloc(sizeof(float)*2*2);
	float matrix_A_values[4] = [1.0, 2.0, 3.0, 4.0];
	for (int i = 0; i < 2; ++i) {
		for (int j = 0; j < 2; ++j) {
			matrix_A[i * 2 + j] = matrix_A_values[i * 2 + j];
		}
	}
	float *matrix_B;
	matrix_B = malloc(sizeof(float)*1*4);
	float matrix_B_values[4] = [1.0, 2.0, 3.0, 4.0];
	for (int i = 0; i < 4; ++i) {
		for (int j = 0; j < 1; ++j) {
			matrix_B[i * 1 + j] = matrix_B_values[i * 1 + j];
		}
	}
	return 0;
}
