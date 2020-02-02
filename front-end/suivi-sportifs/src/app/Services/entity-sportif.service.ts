import { Athlet } from './../Model/athlet';
import { Observable } from 'rxjs';
import { Entitysportif } from './../Model/entitysportif';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Sport } from '../Model/sport';

@Injectable({
  providedIn: 'root'
})
export class EntitySportifService {
  private url="http://localhost:8019/sports";
  private url1="http://localhost:8019/getAllAthlete";
  private url2="http://localhost:8019/entities_sportifs";


  constructor(private http: HttpClient,) { }

  getBy(ii:number):Observable<Sport>{
    
    return this.http.get<Sport>(this.url+"/"+ii);
}
getAllAthletes(id:number):Observable<Athlet[]>{
  return this.http.get<Athlet[]>(this.url1+"/"+id);
}
save(data){
  return this.http.post<any>(this.url2,data);
}
}
