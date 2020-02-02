import { SportService } from './../../Services/sport.service';
import { Athlet } from './../../Model/athlet';
import { EntitySportifService } from './../../Services/entity-sportif.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Sport } from 'src/app/Model/sport';

@Component({
  selector: 'app-entities-sportifs',
  templateUrl: './entities-sportifs.component.html',
  styleUrls: ['./entities-sportifs.component.css']
})
export class EntitiesSportifsComponent implements OnInit {
id;
sport:Sport;
sports:Sport [];

  constructor(private http:EntitySportifService,
    private activeRoute: ActivatedRoute,
    private srvc:SportService) { }

  ngOnInit() {


    var id = +this.activeRoute.snapshot.paramMap.get('id');
    this.id=id;
    this.http.getBy(this.id).subscribe(sport=>{
    this.sport=sport;
    });

    this.srvc.getAllentity_sportife_de_clube(this.id).subscribe( (e:Sport []) => {

      this.sports = e;
      console.log(this.sports);
      
    })
  }


}