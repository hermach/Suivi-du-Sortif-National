import { EntitySportifService } from './../../Services/entity-sportif.service';
import { Athlet } from './../../Model/athlet';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-all-athlets',
  templateUrl: './all-athlets.component.html',
  styleUrls: ['./all-athlets.component.css']
})
export class AllAthletsComponent implements OnInit {
// cote athlete
athlets: Athlet[];
id;
  constructor(private srvc:EntitySportifService,private activeRoute: ActivatedRoute) { }

  ngOnInit() {
    var id = +this.activeRoute.snapshot.paramMap.get('id');
    this.id=id;
    // cote athlete
    this.srvc.getAllAthletes(this.id).subscribe((e : Athlet[]) => {
      this.athlets=e;
      console.log(this.athlets);
      
    });
    // end cote athlete
  }

}
