import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FanListComponent } from './fan-list/fan-list.component';

import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';

import { RouterModule } from '@angular/router';
import { CreateFanComponent } from './create-fan/create-fan.component';
import { UpdateFanComponent } from './update-fan/update-fan.component';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatToolbarModule} from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';
import { MatIconModule } from '@angular/material/icon';


import { MatButtonModule } from '@angular/material/button';
import { NavbarComponent } from './navbar/navbar.component';
import { ArtistesComponent } from './artistes/artistes.component';
import { EvenementsComponent } from './evenements/evenements.component';

@NgModule({
  declarations: [
    AppComponent,
    FanListComponent,
    CreateFanComponent,
    UpdateFanComponent,
    NavbarComponent,
    ArtistesComponent,
    EvenementsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,    
    CommonModule,
    ReactiveFormsModule,
    RouterModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatButtonModule,
    MatIconModule,
    MatListModule,
    MatSidenavModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
