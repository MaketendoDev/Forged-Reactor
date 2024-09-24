// Made with Blockbench 4.11.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmk1_helmet_open<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mk1_helmet_open"), "main");
	private final ModelPart Head;

	public Modelmk1_helmet_open(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(22, 54).addBox(
				-4.0F, -8.0F, -1.0F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.6F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition MainHatLayer_r1 = Head.addOrReplaceChild("MainHatLayer_r1",
				CubeListBuilder.create().texOffs(37, 5).addBox(-4.0F, -3.594F, -1.5F, 8.0F, 8.0F, 3.0F,
						new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(0.0F, -13.1069F, -0.4974F, -2.9234F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}