import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsersService {
  private baseUrl = 'http://localhost:8010/api/test2';

  constructor(private http: HttpClient) { }
  getuserbyId(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }
  updateuser(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }
  getusersList(): Observable<any> {
    return this.http.get(`${this.baseUrl}` + `/users`);
  }
  createuser(user: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}` + `/create`, user);
  }
  
}
