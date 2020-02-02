import { EpreuveCompetition } from './epreuve-competition';
import { Epreuve } from './epreuve';
export class RelationEpComp {
    epreuve_competition:EpreuveCompetition;
    epreuve:Epreuve;
constructor(epreuve:Epreuve,epreuve_competition:EpreuveCompetition){
    this.epreuve=epreuve;
    this.epreuve_competition=epreuve_competition;
}

}

