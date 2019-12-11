window.onload = function() {

   $(".delete-btn").click((e) => {
     var btn = $(e.currentTarget);
     var purchaseId = btn.attr("data-purchase-id");
     btn.attr("disabled", "disabled");

     $.post("/purchase/" + purchaseId + "/delete", () => {

     });
   });
   $(".status-btn").click((e) => {
           var btn = $(e.currentTarget);
           var purchaseId = btn.attr("data-purchase-id");
           btn.attr("disabled", "disabled");

           $.post("/purchase/" + purchaseId + "/status", (data) => {
              if(data){
                    btn.text( "☑");

                    btn.removeClass("btn-secondary");
                    btn.addClass("btn-danger");
            }
            else{ btn.text( "☐");}



           });
         });
};

