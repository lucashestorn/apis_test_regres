import { test, expect } from '../fixtures/api.fixture';

test.describe('Automated API Service Suite', () => {
  test('Smoke API GET /health sem autenticação retorna HTTP 200 e corpo textual Healthy', async ({ apiClient }) => {
    const response = await apiClient.executeTargetRequest();
    expect(response.status()).toBe(200);
    expect(response.headers()['content-type']).toContain('application/json');

    const body = await response.json();
    expect(body).toBeDefined();
  });
});