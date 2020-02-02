import { Federation } from './../../Model/federation';
import { EntitySportifService } from './../../Services/entity-sportif.service';
import { FormBuilder } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Sport } from 'src/app/Model/sport';

@Component({
  selector: 'app-ajout-entity-sportif',
  templateUrl: './ajout-entity-sportif.component.html',
  styleUrls: ['./ajout-entity-sportif.component.css']
})
export class AjoutEntitySportifComponent implements OnInit {
  checkoutForm4;
  id:number;

  constructor(private formBuilder: FormBuilder,
              private srvc:EntitySportifService,
              private activeRoute: ActivatedRoute){ 

}

  ngOnInit() {
    this.id = +this.activeRoute.snapshot.paramMap.get('id');;
    let _sport = new Sport(this.id);
    this.checkoutForm4 = this.formBuilder.group({
      nom: '',
      type: '',
      sport:_sport
    });
      
  }
onSubmit4(data){
this.srvc.save(data).subscribe(()=> {console.log("well executed")},
(err)=> {console.log(err)}
);
}
}
