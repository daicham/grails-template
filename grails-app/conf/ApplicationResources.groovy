modules = {
  'application' {
    resource url:'js/application.js'
  }
  'theme-standard' {
    dependsOn 'bootstrap-js'
    resource url:[dir:'less', file:'theme-standard.less'], attrs:[rel:'stylesheet/less', type:'css']
  }
}