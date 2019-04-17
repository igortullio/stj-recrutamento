import {Injectable} from '@angular/core';
import {Ministro} from '../models/ministro';
import {API_CONFIG} from '../config/api.config';
import {HttpClient} from '@angular/common/http';

@Injectable()
export class MinistroService {

    constructor(public http: HttpClient) {
    }

    findById(id: string) {
        return this.http.get<Ministro>(`${API_CONFIG.baseUrl}/ministros/${id}`);
    }

    insert(obj: Ministro) {
        return this.http.post(
            `${API_CONFIG.baseUrl}/ministros`,
            obj,
            {
                observe: 'response',
                responseType: 'text'
            }
        );
    }

}
