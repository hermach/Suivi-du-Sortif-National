import { Athplushisto } from './../../Model/athplushisto';
import { HistoriqueEntite } from './../../Model/historique-entite';
import { AthletService } from './../../Services/athlet.service';
import { FormBuilder } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Athlet } from 'src/app/Model/athlet';
import { Entitysportif } from 'src/app/Model/entitysportif';

@Component({
  selector: 'app-ajout-athlet',
  templateUrl: './ajout-athlet.component.html',
  styleUrls: ['./ajout-athlet.component.css']
})
export class AjoutAthletComponent implements OnInit {
  checkoutForm2;
  constructor(private formBuilder: FormBuilder,private srvc:AthletService,private activeRoute: ActivatedRoute) {  }
id:number;
_athlet :Athlet;
_histo : HistoriqueEntite;
_athplushisto : Athplushisto;
_entitysportif : Entitysportif;
  ngOnInit() {
    this.id = +this.activeRoute.snapshot.paramMap.get('id');;
    this.checkoutForm2 = this.formBuilder.group({
      nom: '',
      prenom:'',
      date_de_naissance:'',
      image:'',
      date_de_debut:'',


    });
  }
  onSubmit2(data){
      this._entitysportif = new Entitysportif(this.id);
       this._athlet = new Athlet(data.nom,data.prenom,data.date_de_naissance,data.image);
       this._histo = new HistoriqueEntite(data.date_de_debut,this._entitysportif);
       this._athplushisto = new Athplushisto(this._athlet,this._histo);
    console.log(this._athplushisto);
    this.srvc.ahtletajout(this._athplushisto );
  }
}
