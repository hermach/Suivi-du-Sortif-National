import { RelationEpComp } from './../../Model/relation-ep-comp';
import { EpreuveCompetition } from './../../Model/epreuve-competition';
import { Epreuve } from './../../Model/epreuve';
import { Competition } from './../../Model/competition';
import { FederationService } from './../../Services/federation.service';
import { FormBuilder } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-ajoutajoutepreuve',
  templateUrl: './ajoutajoutepreuve.component.html',
  styleUrls: ['./ajoutajoutepreuve.component.css']
})
export class AjoutajoutepreuveComponent implements OnInit {
id:number;
checkoutForm7;
  constructor(private formBuilder: FormBuilder,private srvc:FederationService,private activeRoute: ActivatedRoute) { }

  ngOnInit() {
    this.id = +this.activeRoute.snapshot.paramMap.get('id');
 
    this.checkoutForm7 = this.formBuilder.group({
      label: '',
    });
  }
  onSubmit7(data){
    let epre = new Epreuve(data.label);
    let _comptition = new Competition(this.id) ;
    let ep = new EpreuveCompetition(_comptition);
    let tt = new RelationEpComp(epre,ep);
    console.log(tt);
    
    this.srvc.ajoutepreuve(tt).subscribe(()=> {console.log("well executed")},
    (err)=> {console.log(err)}
    );
  }
}
