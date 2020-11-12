import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { GlobalService } from '../services/global.service';
import { Router } from '@angular/router';

@Component({
  selector: 'register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

    registerForm: FormGroup;

    constructor(
        public _formBuilder: FormBuilder,
        public globalService: GlobalService,
        public router: Router
    ){}

    ngOnInit() {
        this.registerForm = this._formBuilder.group({
            name: ["", Validators.required],
            id: ["", [Validators.required, Validators.pattern("[0-9]{13}")]],
            phone: ["", [Validators.required, Validators.pattern("[0-9]{10}")]]
        });
    }
    submit() {
        this.globalService.submitData(
            this.registerForm.get('name').value,
            this.registerForm.get('id').value,
            this.registerForm.get('phone').value,
        ).subscribe(res => {
            console.log("submitData: ", res)
            this.router.navigate(['/'])
        })
    }
}
