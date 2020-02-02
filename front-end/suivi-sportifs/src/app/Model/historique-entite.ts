import { Athlet } from './athlet';
import { Entitysportif } from './entitysportif';
export class HistoriqueEntite {
    id?:  number ;
    date_de_debut:Date;
    date_de_fin?:Date;
    athlet:Athlet;
    entitysportif: Entitysportif;
    constructor(date_de_debut:Date,entitysportif: Entitysportif){
     this.date_de_debut=date_de_debut;
     this.entitysportif=entitysportif;
    }


}
