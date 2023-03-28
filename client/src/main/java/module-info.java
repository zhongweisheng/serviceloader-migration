//import ch.frankel.blog.serviceloader.log.LogService;

module log.client {
    requires log.api;
    uses ch.frankel.blog.serviceloader.log.LogService;
}