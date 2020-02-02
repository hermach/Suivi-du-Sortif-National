import { FederationService } from './../../Services/federation.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-ajoute-federation',
  templateUrl: './ajoute-federation.component.html',
  styleUrls: ['./ajoute-federation.component.css']
})
export class AjouteFederationComponent implements OnInit {
  checkoutForm;

  constructor(private formBuilder: FormBuilder,private http:FederationService) { 
    this.checkoutForm = this.formBuilder.group({
      nom: '',
      description:'',
      president:'',
      image:''
    });
  }

  ngOnInit() {
  }
  onSubmit(customerData){
    console.log(customerData);
    this.http.save(customerData).subscribe(()=> {console.log("well executed")},
    (err)=> {console.log(err)}
    );
  }

}
