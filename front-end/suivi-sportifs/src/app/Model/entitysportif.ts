import { Federation } from './federation';
import { Sport } from './sport';
export class Entitysportif {
    id:  number ;
    nom: String;
    type: String;
    federation: Federation;
    sport:Sport;
    constructor(id:number){
        this.id=id;
    }
}
