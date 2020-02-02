import { Performence } from './../Model/performence';
import { Competition } from './../Model/competition';
import { Observable } from 'rxjs';
import { Critre } from './../Model/critre';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CriterService {
  private url="http://localhost:8019/criteres";
  private url2="http://localhost:8019/competition_de_federation";
  private url3="http://localhost:8019/competitions";
  private url4="http://localhost:8019/journal_performs";

  constructor(private http: HttpClient) { }

  getAll(ii:number):Observable<Critre[]>{
    return this.http.get<Critre[]>(this.url+"/"+ii);

  }
  addcriter(ss){
    return this.http.post<any>(this.url,ss);
  }
  // ajoutcompetition(cc){
  //   return this.http.post<any>(this.url3,cc);
  // }
  getcompetition(id){
    return this.http.get<Competition[]>(this.url2+"/"+id);
  }
  ajout(ss){
    return this.http.post<any>(this.url2,ss);
  }
  getallcompetition(){
    return this.http.get<Competition[]>(this.url3);

  }
  ajoutPerformence(data){
    return this.http.post<any>(this.url4,data);
  }
  getAllPerAthl(id:number){
    return this.http.get<Performence>(this.url4+"/"+id);

  }
}
