﻿import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
@NgModule({
    imports: [
        BrowserModule,HttpClientModule 
        
    ],
    declarations: [
        AppComponent
		],
    providers: [ ],
    bootstrap: [AppComponent]
})

export class AppModule { }