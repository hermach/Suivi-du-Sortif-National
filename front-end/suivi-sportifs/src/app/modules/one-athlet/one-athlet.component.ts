import { Performence } from './../../Model/performence';
import { CriterService } from './../../Services/criter.service';
import { AthletService } from './../../Services/athlet.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Athlet } from 'src/app/Model/athlet';
import { Chart } from 'chart.js';

@Component({
  selector: 'app-one-athlet',
  templateUrl: './one-athlet.component.html',
  styleUrls: ['./one-athlet.component.css']
})
export class OneAthletComponent implements OnInit {
  id:number;
  athlet:Athlet;
  journal_performence:Performence;
  //variable belone to hart
  canvas: any;
  ctx: any;
  constructor(private activeRoute: ActivatedRoute,
     private srvc:AthletService,private srvc1:CriterService) { }

  ngOnInit() {
     this.id = +this.activeRoute.snapshot.paramMap.get('id');
    console.log(this.id);

    this.srvc.getBy(this.id).subscribe(athlet=>{
      this.athlet=athlet;
      console.log(this.athlet);
      
    });
    
    this.srvc1.getAllPerAthl(this.id).subscribe(journal_performence=>{
      this.journal_performence=journal_performence;
      console.log(journal_performence);
      
    });
       // strat code chart js
       this.canvas = document.getElementById('myChart');
       this.ctx = this.canvas.getContext('2d');
       let myChart = new Chart(this.ctx, {
         type: 'bar',
         data: {
             labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
             datasets: [{
                 label: '# of Votes',
                 data: [12, 19, 3, 5, 2, 3],
                 backgroundColor: [
                     'rgba(255, 99, 132, 0.2)',
                     'rgba(54, 162, 235, 0.2)',
                     'rgba(255, 206, 86, 0.2)',
                     'rgba(75, 192, 192, 0.2)',
                     'rgba(153, 102, 255, 0.2)',
                     'rgba(255, 159, 64, 0.2)'
                 ],
                 borderColor: [
                     'rgba(255, 99, 132, 1)',
                     'rgba(54, 162, 235, 1)',
                     'rgba(255, 206, 86, 1)',
                     'rgba(75, 192, 192, 1)',
                     'rgba(153, 102, 255, 1)',
                     'rgba(255, 159, 64, 1)'
                 ],
                 borderWidth: 1
             }]
         },
         options: {
             scales: {
                 yAxes: [{
                     ticks: {
                         beginAtZero: true
                     }
                 }]
             }
         }
     });
     //end code chart js
  }

}
