import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { ToastController} from 'ionic-angular';

import { SegundapaginaPage} from '../segundapagina/segundapagina';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  nombre : any;

  constructor(public navCtrl: NavController, 
  public toastCtrl: ToastController) {

  }

  abrirSegundaPagina(){

    this.navCtrl.push(SegundapaginaPage)
  }



mostrarToast(){
  let ubicacion = 'top'; 
  let nombre = this.nombre;
  let toast = this.toastCtrl.create({
    message: 'Su nombre es: ' + nombre,
    duration: 2000,
    position: ubicacion
  });
  toast.present();
}


}
