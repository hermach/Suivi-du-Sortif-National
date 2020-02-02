import { FlexLayoutModule } from '@angular/flex-layout';
import { DefaultModule } from './layouts/default/default.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'; 


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


import {MatButtonModule} from '@angular/material/button';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AjouteFederationComponent } from './modules/ajoute-federation/ajoute-federation.component';
import { DetailFederationComponent } from './modules/detail-federation/detail-federation.component';
import { AjoutSportComponent } from './modules/ajout-sport/ajout-sport.component';
import { AllAthletsComponent } from './modules/all-athlets/all-athlets.component';
import { EntitiesSportifsComponent } from './modules/entities-sportifs/entities-sportifs.component';
import { AjoutAthletComponent } from './modules/ajout-athlet/ajout-athlet.component';
import { AjoutEntitySportifComponent } from './modules/ajout-entity-sportif/ajout-entity-sportif.component';
import { OneAthletComponent } from './modules/one-athlet/one-athlet.component';
import { AjoutCritreComponent } from './modules/ajout-critre/ajout-critre.component';
import { AjoutCompetitionComponent } from './modules/ajout-competition/ajout-competition.component';
import { AjoutajoutepreuveComponent } from './modules/ajoutajoutepreuve/ajoutajoutepreuve.component';
import { TranchAgeComponent } from './modules/tranch-age/tranch-age.component';
import { PerformenceComponent } from './modules/performence/performence.component';
import { ChartPerComponent } from './modules/chart-per/chart-per.component';





@NgModule({
  declarations: [
    AppComponent,
    AjouteFederationComponent,
    DetailFederationComponent,
    AjoutSportComponent,
    AllAthletsComponent,
    EntitiesSportifsComponent,
    AjoutAthletComponent,
    AjoutEntitySportifComponent,
    OneAthletComponent,
    AjoutCritreComponent,
    AjoutCompetitionComponent,
    AjoutajoutepreuveComponent,
    TranchAgeComponent,
    PerformenceComponent,
    ChartPerComponent,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatButtonModule,
    DefaultModule,
    ReactiveFormsModule,
    FormsModule,
    FlexLayoutModule,
    HttpClientModule,
    
    
    // RouterModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
