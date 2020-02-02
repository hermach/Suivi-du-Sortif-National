import { Sport } from 'src/app/Model/sport';
import { FormBuilder } from '@angular/forms';
import { Critre } from './../../Model/critre';
import { CriterService } from './../../Services/criter.service';
import { Component, OnInit, Injectable } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
@Injectable({
  providedIn: 'root'
})
@Component({
  selector: 'app-ajout-critre',
  templateUrl: './ajout-critre.component.html',
  styleUrls: ['./ajout-critre.component.css']
})
export class AjoutCritreComponent implements OnInit {
criter:Critre[];
checkoutForm5;
id:number;
  constructor(private activeRoute: ActivatedRoute,
              private srvc: CriterService, 
              private formBuilder: FormBuilder) { }

  ngOnInit() {
     this.id = +this.activeRoute.snapshot.paramMap.get('id');
     let _sport = new Sport(this.id); 
     this.srvc.getAll(this.id).subscribe(criter =>{
     this.criter=criter;})
     this.checkoutForm5 = this.formBuilder.group({
      nom: '',
      type_de_mesure:'',
      sport:_sport
    });
  }
onSubmit5(data){
  this.srvc.addcriter(data).subscribe(()=> {console.log("well executed")},
  (err)=> {console.log(err)}
  );
  }

}
