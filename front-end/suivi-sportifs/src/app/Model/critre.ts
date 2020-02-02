import { Sport } from 'src/app/Model/sport';
export class Critre {
    id:  number ;
    nom:String;
    type_de_mesure:String;
    sport:Sport;
    constructor(nom:String,type_de_mesure:String,sport:Sport){
        this.nom=nom;
        this.type_de_mesure=type_de_mesure;
        this.sport=sport;
    }
}
