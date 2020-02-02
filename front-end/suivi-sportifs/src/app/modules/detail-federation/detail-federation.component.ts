import { Federation } from './../../Model/federation';
import { FederationService } from './../../Services/federation.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-detail-federation',
  templateUrl: './detail-federation.component.html',
  styleUrls: ['./detail-federation.component.css']
})
export class DetailFederationComponent implements OnInit {
  fed:Federation;
  id:number;
  constructor(private http:FederationService,private activeRoute: ActivatedRoute) { }

  ngOnInit() {
    var id = +this.activeRoute.snapshot.paramMap.get('id');
    this.id=Number(id);
    this.getting()
  }
 

  getting(){
    this.http.getBy(this.id).subscribe(federation=>{
      this.fed=federation;

      console.log("hello hello hello hello")
      console.log("dzdzdz"+this.id);

      // console.log(e);
      // console.log(this.fed);
    })
  
  }






}


