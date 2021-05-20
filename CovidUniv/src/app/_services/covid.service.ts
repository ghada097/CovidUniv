import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Testpcr} from '../models/testpcr'

@Injectable({
  providedIn: 'root'
})
export class CovidService {

  private Url1 = 'http://localhost:8020/api/Cas';
  private Url2 = 'http://localhost:8020/api/TestPCR';
  private Url3 = 'http://localhost:8020/api/Guérisons';
  private Url4 = 'http://localhost:8020/api/CasCampus';
  private Url5 = 'http://localhost:8020/api/Décès';
  private Url6 = 'http://localhost:8020/api/DécèsCampus';

  constructor(private http: HttpClient) { }

  getListeCas() {
    return this.http.get(`${this.Url1}`)
  }
 
  getCasByMois(mois: string) {
    return this.http.get(`${this.Url1}/mois/${mois}`);
  }

  createTest(Testpcr: Object): Observable<Object> {
    return this.http.post(`${this.Url2}` + `/create`, Testpcr);
  }

  getListeGuérisons() {
    return this.http.get(`${this.Url3}`)
  }

  getListeCasCampus() {
    return this.http.get(`${this.Url4}`)
  }
  getListeDécèsCampus() {
    return this.http.get(`${this.Url6}`)
  }

  getSommeCas() {
    return this.http.get(`${this.Url1}/total`)
  }
  
  getSommeGuérions() {
    return this.http.get(`${this.Url3}/total`)
  }

  getSommeCasCampus() {
    return this.http.get(`${this.Url4}/total`)
  }

  getSommeDécès() {
    return this.http.get(`${this.Url5}/total`)
  }
  getSommeDécèsCampus() {
    return this.http.get(`${this.Url6}/total`)
  }
}
