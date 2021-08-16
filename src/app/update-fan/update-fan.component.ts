import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Fan } from '../fan';
import { FanService } from '../fan.service';

@Component({
  selector: 'app-update-fan',
  templateUrl: './update-fan.component.html',
  styleUrls: ['./update-fan.component.css']
})
export class UpdateFanComponent implements OnInit {

  fan: Fan = new Fan();
  id: number;
  constructor(private fanService: FanService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {

    this.id = this.route.snapshot.params['id'];

    this.fanService.getFanById(this.id).subscribe(data => {
      this.fan = data;
    }, error => console.log(error));
  }

  onSubmit(){
    this.fanService.updateFantoRemote(this.id, this.fan).subscribe( data =>{
      this.goToFanList();
    }
    , error => console.log(error));
  }

  goToFanList(){
    this.router.navigate(['/fanlist']);
  }

}
