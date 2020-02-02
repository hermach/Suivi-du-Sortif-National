import { TranchAge } from './../Model/tranch-age';
import { Observable } from 'rxjs';
import { Federation } from './../Model/federation';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FederationService {
  private url="http://localhost:8019/federation";
  private url2="http://localhost:8019/epreuve";
  private url3="http://localhost:8019/tranch_age";



  constructor(private http: HttpClient,) { }
variable;
  getall(){
   this.variable = this.http.get(this.url);
    return this.variable;
  }
  save(ss){
    console.log(ss);
    return this.http.post<any>(this.url,ss);
  }

  getBy(ii:number):Observable<Federation>{
   
       return this.http.get<Federation>(this.url+"/"+ii);
}
ajoutepreuve(ss){
  return this.http.post<any>(this.url2,ss);
}
ajouttranchage(tt){
  return this.http.post<any>(this.url3,tt);

}
getalltranchage():Observable<TranchAge[]>{
  return this.http.get<TranchAge[]>(this.url3);

}

// a;
//   getBy(ii){
//     this.a= this.variable.find(
//       (l) => l.id==ii)
//       return this.a;
//    }

}
