import { Critre } from './../../Model/critre';
import { AjoutCritreComponent } from './../ajout-critre/ajout-critre.component';
import { EntitiesSportifsComponent } from './../entities-sportifs/entities-sportifs.component';
import { Athlet1 } from './../../Model/athlet1';
import { Athlet } from 'src/app/Model/athlet';
import { Performence } from './../../Model/performence';
import { Competition } from './../../Model/competition';
import { CriterService } from './../../Services/criter.service';
import { FormBuilder } from '@angular/forms';
import { TranchAge } from './../../Model/tranch-age';
import { FederationService } from './../../Services/federation.service';
import { EpreuveService } from './../../Services/epreuve.service';
import { Component, OnInit } from '@angular/core';
import { Epreuve } from 'src/app/Model/epreuve';
import { ActivatedRoute } from '@angular/router';
import { Sport } from 'src/app/Model/sport';

@Component({
  selector: 'app-performence',
  templateUrl: './performence.component.html',
  styleUrls: ['./performence.component.css']
})
export class PerformenceComponent implements OnInit {
  epreuve:Epreuve[];
  tranchAge:TranchAge[];
  id:number;
  sport:Sport;
  critr:Critre[];
competition:Competition[];
_performence:Performence;
  checkoutForm9;
  constructor(private srvc:EpreuveService,
             private srvc1:FederationService,
             private activeRoute: ActivatedRoute,
             private formBuilder: FormBuilder,
             private srvc2:CriterService,
             private criter:AjoutCritreComponent) { }

  ngOnInit() {
    this.id = +this.activeRoute.snapshot.paramMap.get('id');
   this.criter.ngOnInit();
   this.critr = this.criter.criter;
  console.log("azertyu     "+this.critr);
  
    
    let _ath= new Athlet1(this.id);
    this.srvc.getAllEpreuve().subscribe((e: Epreuve[])=>{
    this.epreuve=e;
    console.log(this.epreuve);
 
    })
    this.checkoutForm9 = this.formBuilder.group({
      date_competition: '',
      tranchage:Number,
      epreuve:Number,
      competition:Number,
      athletes:_ath

      

    });
    this.srvc1.getalltranchage().subscribe((e: TranchAge[])=>{
      this.tranchAge=e;
      console.log(this.tranchAge);
      })
      this.srvc2.getallcompetition().subscribe((e: Competition[]) =>{
        this.competition=e;
        console.log(this.competition);
        
      })
  }
  onSubmit9(data){
console.log(data);
let _comp = new Competition(Number(data.competition));
let  _epreuv = new Epreuve(Number(data.epreuve));
let _tranch = new TranchAge(Number(data.tranchage));
console.log(data.competition);
this._performence = new Performence(data.date_competition,data.athletes,_comp,_tranch,_epreuv);
console.log(this._performence)
this.srvc2.ajoutPerformence(this._performence).subscribe(()=> {console.log("well executed")},
(err)=> {console.log(err)}
);
  }


  
}
