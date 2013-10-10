$(document).ready(function() {

	$('.link-times-botao').click(function() {
		$.ajax({
			type: "GET",
			url: "/ambientes/" + $(this).attr("data-ambiente") + "/time/" + $(this).attr("data-time-id") + "/log",
			success: function(response) {
				if (response == "ok") {
					location.reload();
				}
				else {
					alert("Ocorreu um erro ao tentar solicitar/liberar o token do ambiente!");
				}
			},
			error: function() {
				alert("Ocorreu um erro ao tentar solicitar/liberar o token do ambiente!");
			}
		});
		
		return false;
	});
});