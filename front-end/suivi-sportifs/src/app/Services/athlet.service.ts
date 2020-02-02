import { HistoriqueEntite } from './../Model/historique-entite';
import { Observable } from 'rxjs';
import { Athplushisto } from './../Model/athplushisto';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Athlet } from '../Model/athlet';
import { Entitysportif } from '../Model/entitysportif';

@Injectable({
  providedIn: 'root' 
})
export class AthletService {
  private url="http://localhost:8019/athletes";

  constructor(private http: HttpClient) { }
  ahtletajout(ss:Athplushisto){
  console.log(ss);
    return this.http.post<any>(this.url,ss).subscribe(data =>{ 
      ss = data ;
      console.log(data);
      
    });
  }
  getBy(ii:number):Observable<Athlet>{
    return this.http.get<Athlet>(this.url+"/"+ii);
}

}
