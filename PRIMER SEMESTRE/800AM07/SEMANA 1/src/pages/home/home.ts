import { Component } from '@angular/core';

import { NavController } from 'ionic-angular';
import { AlertController } from 'ionic-angular';

//Abrir una nueva pagina

import { AboutPage } from '../about/about';


@Component({
  selector: 'page-home',
  templateUrl: 'home.html',
 // template: '<button ion-button [navPush]="aboutPage">Abrir otra pagina</button>'
})


export class HomePage {

  total : number = 0;
  firstNumber : any;
  secondNumber : any;

  constructor(public alertCtrl: AlertController, public navCtrl : NavController) {
    
  }



  load(){

    this.navCtrl.push(AboutPage,{
      val:'mensaje'
    })

  }
  

addThemFunction(){
  let firstNumber = this.firstNumber ? parseFloat(this.firstNumber) : 0;
  let secondNumber = this.firstNumber ? parseFloat(this.secondNumber) : 0;
  this.total = firstNumber + secondNumber;
  console.log("clicked!");
}
 
getInstantTotal(){
  let firstNumber = this.firstNumber ? parseFloat(this.firstNumber) : 0;
  let secondNumber = this.firstNumber ? parseFloat(this.secondNumber) : 0;
  return firstNumber + secondNumber;
}

showAlert(){

  let alert = this.alertCtrl.create({
    title: 'Titulo de la venta',
    subTitle: 'Texto de la ventana...',
    buttons: ['OK']

  });
alert.present();
}


}
