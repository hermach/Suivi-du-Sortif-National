import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SportService {
  private url="http://localhost:8019/sports";
private url2="http://localhost:8019/getAllentity_sportife_de_clube"
  constructor(private http: HttpClient,) { }

  save(ss,id: number){
    return this.http.post<any>(this.url+"/"+id,ss);
  }
  variable;
  getAllentity_sportife_de_clube(id: number){

 this.variable = this.http.get(this.url2+"/"+id);
 console.log(this.variable);
 
 return this.variable;

  }
}
