import { Competition } from './competition';
import { Epreuve } from './epreuve';
export class EpreuveCompetition {
    epreuve: Epreuve;
    competition:Competition;
    constructor(competition:Competition){
        this.competition=competition;
    }
}
