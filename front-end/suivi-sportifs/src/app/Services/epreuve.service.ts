import { TranchAge } from './../Model/tranch-age';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Epreuve } from '../Model/epreuve';

@Injectable({
  providedIn: 'root'
})
export class EpreuveService {
  private url="http://localhost:8019/epreuve";

  constructor(private http: HttpClient) { }

  getAllEpreuve():Observable<TranchAge[]>{
    return this.http.get<TranchAge[]>(this.url);
  }
}
