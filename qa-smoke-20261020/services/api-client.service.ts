import { APIRequestContext, APIResponse } from '@playwright/test';
import { BaseApiService } from './base-api.service';

/**
 * ApiClientService - Service Object Model for target API endpoints.
 */
export class ApiClientService extends BaseApiService {
  constructor(request: APIRequestContext, baseUrl: string = '') {
    super(request, baseUrl);
  }

  async executeTargetRequest(): Promise<APIResponse> {
    return await this.get('https://api-staging.qaexperia.com/health');
  }
}