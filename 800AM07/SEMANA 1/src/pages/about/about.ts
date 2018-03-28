import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';


import { ToastController } from 'ionic-angular';

@IonicPage()
@Component({
  selector: 'page-about',
  templateUrl: 'about.html',
})
export class AboutPage {

  nombre : any;

  constructor(public navCtrl: NavController, public navParams: NavParams, 
              public toastCtrl: ToastController
  ) {
  
    //Mensaje
    //console.log(navParams.get('val'));
  }

  showToast(position : string){

    let nombre = this.nombre;

    let toast = this.toastCtrl.create({
      message: 'Nombre: ' + nombre,
      duration: 2000,
      position: position
    });
    toast.present(toast);
  }

  showToastWithCloseButton(){
    const toast = this.toastCtrl.create({
      message: 'Este es otro mensaje',
      showCloseButton: true,
      closeButtonText: 'Ok'
    });
    toast.present();
  }

  showLongToast(){
    let toast = this.toastCtrl.create({
      message: 'Este es un mensaje',
      duration: 2000
    });
    toast.present();
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad AboutPage');
  }

}
