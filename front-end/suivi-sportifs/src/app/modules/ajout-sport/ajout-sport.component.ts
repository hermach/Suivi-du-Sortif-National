import { SportService } from './../../Services/sport.service';
import { FederationService } from './../../Services/federation.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-ajout-sport',
  templateUrl: './ajout-sport.component.html',
  styleUrls: ['./ajout-sport.component.css']
})
export class AjoutSportComponent implements OnInit {
  checkoutForm1;
  id: number;
  constructor(
    private formBuilder: FormBuilder,
    private http:SportService, 
    private activeRoute: ActivatedRoute) {
    this.checkoutForm1 = this.formBuilder.group({
      nom: ''
    });
   }

  ngOnInit() {
    this.id = +this.activeRoute.snapshot.paramMap.get('id');
  }
  onSubmit1(customerData){
    console.log(customerData,this.id);
    this.http.save(customerData,this.id).subscribe(()=> {console.log("well executed")},
    (err)=> {console.log(err)}
    );
  }
}
