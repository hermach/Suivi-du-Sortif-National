import { Federation } from './../../Model/federation';
import { CompetitionDeFederation } from './../../Model/competition-de-federation';
import { Fedcomp } from './../../Model/fedcomp';
import { Competition } from './../../Model/competition';
import { FormBuilder } from '@angular/forms';
import { CriterService } from './../../Services/criter.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-ajout-competition',
  templateUrl: './ajout-competition.component.html',
  styleUrls: ['./ajout-competition.component.css']
})
export class AjoutCompetitionComponent implements OnInit {
    id:number;
    checkoutForm6;
    competition:Competition[];
  constructor(private activeRoute: ActivatedRoute,
    private srvc: CriterService, 
    private formBuilder: FormBuilder) { }


  ngOnInit() {
    this.id = +this.activeRoute.snapshot.paramMap.get('id');
    this.srvc.getcompetition(this.id).subscribe((e : Competition[])=>{
    this.competition=e;
   console.log(this.competition);
    })
    this.checkoutForm6 = this.formBuilder.group({
      nom: '',
      lieu_de_competition:'',
      type:''
    });
    }
    
  onSubmit6(data){
    let fed = new Federation(this.id);
let comp= new CompetitionDeFederation(fed);
let gfh= new Fedcomp(comp,data);

this.srvc.ajout(gfh).subscribe(()=> {console.log("well executed")},
(err)=> {console.log(err)}
);


    }
  }


