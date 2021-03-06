package net.minecraft.entity.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityFireworkRocket extends Entity {

   private int field_92056_a;
   private int field_92055_b;
   private static final String __OBFID = "CL_00001718";


   public EntityFireworkRocket(World p_i1762_1_) {
      super(p_i1762_1_);
      this.func_70105_a(0.25F, 0.25F);
   }

   protected void func_70088_a() {
      this.field_70180_af.func_82709_a(8, 5);
   }

   public EntityFireworkRocket(World p_i1763_1_, double p_i1763_2_, double p_i1763_4_, double p_i1763_6_, ItemStack p_i1763_8_) {
      super(p_i1763_1_);
      this.field_92056_a = 0;
      this.func_70105_a(0.25F, 0.25F);
      this.func_70107_b(p_i1763_2_, p_i1763_4_, p_i1763_6_);
      int var9 = 1;
      if(p_i1763_8_ != null && p_i1763_8_.func_77942_o()) {
         this.field_70180_af.func_75692_b(8, p_i1763_8_);
         NBTTagCompound var10 = p_i1763_8_.func_77978_p();
         NBTTagCompound var11 = var10.func_74775_l("Fireworks");
         if(var11 != null) {
            var9 += var11.func_74771_c("Flight");
         }
      }

      this.field_70159_w = this.field_70146_Z.nextGaussian() * 0.001D;
      this.field_70179_y = this.field_70146_Z.nextGaussian() * 0.001D;
      this.field_70181_x = 0.05D;
      this.field_92055_b = 10 * var9 + this.field_70146_Z.nextInt(6) + this.field_70146_Z.nextInt(7);
   }

   public void func_70071_h_() {
      this.field_70142_S = this.field_70165_t;
      this.field_70137_T = this.field_70163_u;
      this.field_70136_U = this.field_70161_v;
      super.func_70071_h_();
      this.field_70159_w *= 1.15D;
      this.field_70179_y *= 1.15D;
      this.field_70181_x += 0.04D;
      this.func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
      float var1 = MathHelper.func_76133_a(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
      this.field_70177_z = (float)(Math.atan2(this.field_70159_w, this.field_70179_y) * 180.0D / 3.1415927410125732D);

      for(this.field_70125_A = (float)(Math.atan2(this.field_70181_x, (double)var1) * 180.0D / 3.1415927410125732D); this.field_70125_A - this.field_70127_C < -180.0F; this.field_70127_C -= 360.0F) {
         ;
      }

      while(this.field_70125_A - this.field_70127_C >= 180.0F) {
         this.field_70127_C += 360.0F;
      }

      while(this.field_70177_z - this.field_70126_B < -180.0F) {
         this.field_70126_B -= 360.0F;
      }

      while(this.field_70177_z - this.field_70126_B >= 180.0F) {
         this.field_70126_B += 360.0F;
      }

      this.field_70125_A = this.field_70127_C + (this.field_70125_A - this.field_70127_C) * 0.2F;
      this.field_70177_z = this.field_70126_B + (this.field_70177_z - this.field_70126_B) * 0.2F;
      if(this.field_92056_a == 0 && !this.func_174814_R()) {
         this.field_70170_p.func_72956_a(this, "fireworks.launch", 3.0F, 1.0F);
      }

      ++this.field_92056_a;
      if(this.field_70170_p.field_72995_K && this.field_92056_a % 2 < 2) {
         this.field_70170_p.func_175688_a(EnumParticleTypes.FIREWORKS_SPARK, this.field_70165_t, this.field_70163_u - 0.3D, this.field_70161_v, this.field_70146_Z.nextGaussian() * 0.05D, -this.field_70181_x * 0.5D, this.field_70146_Z.nextGaussian() * 0.05D, new int[0]);
      }

      if(!this.field_70170_p.field_72995_K && this.field_92056_a > this.field_92055_b) {
         this.field_70170_p.func_72960_a(this, (byte)17);
         this.func_70106_y();
      }

   }

   public void func_70014_b(NBTTagCompound p_70014_1_) {
      p_70014_1_.func_74768_a("Life", this.field_92056_a);
      p_70014_1_.func_74768_a("LifeTime", this.field_92055_b);
      ItemStack var2 = this.field_70180_af.func_82710_f(8);
      if(var2 != null) {
         NBTTagCompound var3 = new NBTTagCompound();
         var2.func_77955_b(var3);
         p_70014_1_.func_74782_a("FireworksItem", var3);
      }

   }

   public void func_70037_a(NBTTagCompound p_70037_1_) {
      this.field_92056_a = p_70037_1_.func_74762_e("Life");
      this.field_92055_b = p_70037_1_.func_74762_e("LifeTime");
      NBTTagCompound var2 = p_70037_1_.func_74775_l("FireworksItem");
      if(var2 != null) {
         ItemStack var3 = ItemStack.func_77949_a(var2);
         if(var3 != null) {
            this.field_70180_af.func_75692_b(8, var3);
         }
      }

   }

   public float func_70013_c(float p_70013_1_) {
      return super.func_70013_c(p_70013_1_);
   }

   public boolean func_70075_an() {
      return false;
   }
}
