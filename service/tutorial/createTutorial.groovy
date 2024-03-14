def tutorial = ec.entity.makeValue("tutorial.Tutorial")
println("The value of tutorial is ==== " + tutorial)
tutorial.setFields(context, true, null, null)
if (!tutorial.tutorialId) tutorial.setSequencedIdPrimary()

println("The value of tutorial after ====" +tutorial)
tutorial.create()