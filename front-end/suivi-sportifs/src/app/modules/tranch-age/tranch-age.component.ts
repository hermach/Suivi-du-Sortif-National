import { FormBuilder } from '@angular/forms';
import { FederationService } from './../../Services/federation.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tranch-age',
  templateUrl: './tranch-age.component.html',
  styleUrls: ['./tranch-age.component.css']
})
export class TranchAgeComponent implements OnInit {
  checkoutForm8;
  constructor(
    private formBuilder: FormBuilder,
    private srvc:FederationService ){}

  ngOnInit() {
    this.checkoutForm8 = this.formBuilder.group({
      age_max: '',
      age_min:'',
      label:''
    });
  }
  onSubmit8(data){
console.log(data);
this.srvc.ajouttranchage(data).subscribe(()=> {console.log("well executed")},
(err)=> {console.log(err)}
);
  }
}
