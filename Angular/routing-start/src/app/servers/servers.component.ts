import { Component, OnInit } from '@angular/core';

import { ServersService } from './servers.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-servers',
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})

export class ServersComponent implements OnInit {
  private servers: {id: number, name: string, status: string}[] = [];

  constructor ( 
    private serversService: ServersService, 
    private router: Router, 
    private route: ActivatedRoute 
  ) { }

  // Angular Lifecycle Hook
  // Note: Initialize the directive/component after Angular first displays the data-bound properties and sets the 
  // directive/component's input properties.
  ngOnInit() {
    this.servers = this.serversService.getServers();
  }

  // Create an onReload method
  onReload() {
    // this.router.navigate(['servers'], {relativeTo: this.route});
  }

}
