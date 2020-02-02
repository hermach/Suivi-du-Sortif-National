import { CompetitionDeFederation } from './competition-de-federation';
import { Federation } from './federation';
import { Competition } from './competition';
export class Fedcomp {
    competition:Competition;
    competition_de_federation:CompetitionDeFederation;

    constructor(competition_de_federation:CompetitionDeFederation,competition:Competition){
        this.competition=competition;
        this.competition_de_federation=competition_de_federation;
    }
}
