import { FederationService } from './../../Services/federation.service';
import { Federation } from './../../Model/federation';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
federation:Federation[];


  constructor(private http:FederationService) { }

  ngOnInit() {
    this.http.getall().subscribe((e: Federation[]) => {
      this.federation=e;
      console.log(e);
      console.log(this.federation);
       });
  }











}
