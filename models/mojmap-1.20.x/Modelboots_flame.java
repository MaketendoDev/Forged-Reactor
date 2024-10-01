// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelboots_flame<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "boots_flame"), "main");
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public Modelboots_flame(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(12, 8)
						.addBox(-1.0F, 14.0F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 8)
						.addBox(1.0F, 14.0F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition cube_r1 = RightLeg.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(12, 8).mirror()
						.addBox(-1.0F, 1.0F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 13.0F, -2.0F, 0.0F, 1.5272F, 0.0F));

		PartDefinition cube_r2 = RightLeg
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(12, 8).addBox(-1.0F, 1.0F, -1.0F, 0.0F, 5.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, 0.0F, 1.5272F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(12, 8)
						.addBox(1.0F, 14.0F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 8)
						.addBox(-1.0F, 14.0F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition cube_r3 = LeftLeg
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(12, 8).addBox(-1.0F, 1.0F, -1.0F, 0.0F, 5.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, 0.0F, 1.5272F, 0.0F));

		PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(12, 8).addBox(-1.0F, 1.0F, -1.0F, 0.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -2.0F, 0.0F, 1.5272F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}