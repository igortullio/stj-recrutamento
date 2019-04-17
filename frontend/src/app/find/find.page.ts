import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {MinistroService} from '../../services/ministro.service';

@Component({
  selector: 'app-find',
  templateUrl: './find.page.html'
})
export class FindPage implements OnInit {

  formGroup: FormGroup;

  constructor(public formBuilder: FormBuilder, public ministroService: MinistroService) {
    this.formGroup = this.formBuilder.group({
      id: ['', [Validators.required]]
    });
  }

  ngOnInit() {
  }

  find() {
    this.ministroService.findById(this.formGroup.value.id).subscribe(
      response => {
        alert('Sucesso');
      },
      error => {}
    );
  }

}
