import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from "@angular/router";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";

import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { ReportComponent } from './report/report.component';
import { DemoMaterialModule } from './material-module';
import "hammerjs";
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

const appRoutes: Routes = [
  {
    path: "",
    component: ReportComponent
  },
  {
    path: "register",
    component: RegisterComponent
  }
];

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    ReportComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    RouterModule.forRoot(appRoutes),
    DemoMaterialModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
